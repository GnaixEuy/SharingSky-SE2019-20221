var imgs = [
    "img/wine1.jpg",
    "img/wine2.jpg",
    "img/wine3.jpg",
    "img/wine4.jpg",
    "img/wine5.jpg",
    "img/wine6.jpg",
];

let index = 0;

imgChange = () => {
    let imgObject = document.getElementById("img-area").firstElementChild;
    window.setInterval(() => {
        imgObject.src = imgs[index % imgs.length];
        index++;
    }, 3000);
};

imgNext = () => {
    let imgObject = document.getElementById("img-area").firstElementChild;
    imgObject.src = imgs[++index % imgs.length];
};

imgBefore = () => {
    let imgObject = document.getElementById("img-area").firstElementChild;
    imgObject.src = imgs[--index % imgs.length];
};

window.onload = () => {
    imgChange();
};
