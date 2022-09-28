closePage = () => {
    window.close();
};

collect = () => {
    confirm("是否添加如收藏");
};

deleteItem = () => {
    confirm("是否删除");
};

settlement = () => {
    confirm(`您本次购买的商品信息如下：
商品名称：白岩松：白说、岛上书店；
商品数量：2件：
商品总计：46.00；
远费：0元：
请确认以上信息是否有误！！!`);
};
