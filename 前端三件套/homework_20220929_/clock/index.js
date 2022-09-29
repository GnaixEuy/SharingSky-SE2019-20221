window.onload = () => {
    var year = document.getElementById("year");
    var month = document.getElementById("month");
    var day = document.getElementById("day");
    var allTime = document.getElementById("allTime");
    var week = document.getElementById("week");
    window.setInterval(() => {
        var date = new Date();
        year.innerHTML = date.getFullYear();
        month.innerHTML = date.getMonth() + 1;
        day.innerHTML = date.getDate();
        allTime.innerHTML = this.timeFilter(date.toLocaleTimeString());
        week.innerHTML = this.weekFilter(date.getDay());
    }, 1000);

    weekFilter = (week) => {
        let weeks = [
            "星期日",
            "星期一",
            "星期二",
            "星期三",
            "星期四",
            "星期五",
            "星期六",
        ];
        return weeks[week];
    };

    timeFilter = (time) => {
        var times = time.split(":");
        var hour = times[0];
        var amOrPm = "AM";
        if (hour >= 12) {
            amOrPm = "PM";
            hour -= 12;
        }
        return hour + ":" + times[1] + ":" + times[2] + " " + amOrPm;
    };
};
