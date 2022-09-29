selectAll = () => {
    var all = document.getElementById("all");
    var products = document.getElementsByName("product");
    var isTrue = false;
    if (all.checked == true) {
        isTrue = true;
    }

    products.forEach((element) => {
        element.checked = isTrue;
    });
};
