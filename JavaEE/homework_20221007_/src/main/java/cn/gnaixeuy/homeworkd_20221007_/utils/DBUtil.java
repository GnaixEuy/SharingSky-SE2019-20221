package cn.gnaixeuy.homeworkd_20221007_.utils;
//JDBC工具类

import org.apache.commons.beanutils.BeanUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    private final static String URL = "jdbc:mysql://localhost:3306/homework";
    private final static String USER = "root";
    private final static String PASSWORD = "123456";

    //获取连接
    public static Connection getConn() {
        Connection conn = null;
        //加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.err.println("---------获取连接出现异常！-------------");
            e.printStackTrace();
        }
        return conn;

    }

    //预编译
    public static PreparedStatement setPstmt(Connection conn, String sql, Object... paramas) {
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < paramas.length; i++) {
                pstmt.setObject(i + 1, paramas[i]);
            }

        } catch (SQLException e) {
            System.err.println("-------预编译异常-----------");
            e.printStackTrace();
        }

        return pstmt;
    }

    //资源关闭
    public static void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //通用增删改公共方法
    public static int myExecuteUpdate(String sql, Object... paramas) {
        Connection conn = getConn();
        PreparedStatement pstmt = setPstmt(conn, sql, paramas);
        int result = -1;
        try {
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pstmt, null);
        }
        return result;

    }

    /**
     * 通用查询方法返回list对象
     *
     * @param conn
     * @param sql
     * @param clazz
     * @param paramas
     * @return
     */
    public static Object select(String sql, Class clazz, Object... paramas) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        List list = new ArrayList();
        conn = getConn();
        pstmt = setPstmt(conn, sql, paramas);
        try {
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Object obj = convert(rs, clazz);
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pstmt, rs);
        }

        return null;

    }

    //查询单个对象
    public static Object getFirst(String sql, Class clazz, Object... paramas) {
        List list = (List) select(sql, clazz, paramas);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }


    /**
     * 查询结果转换
     *
     * @param rs    结果集
     * @param clazz 目标类
     * @return 返回一个clazz的实例对象
     */
    public static Object convert(ResultSet rs, Class clazz) {
        try {
            //getName 类名， 包含了完整的一个包结构
            if (clazz.getName().equals("java.lang.Object")) {
                return rs.getObject(1);
            }
            //newInstance 会调用实体类里面的无参构造
            Object obj = clazz.newInstance();
            //rs.getMetaData() 去获取ResultSet对象他的列、类型、属性等
            ResultSetMetaData metaData = rs.getMetaData();
            //getColumnCount获取列的个数
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                //获取列名name
                String name = metaData.getColumnLabel(i);
                //注意：列名与属性名必须要保持一致，最好是遵循骆驼命名方法
                BeanUtils.setProperty(obj, name, rs.getObject(i));
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
