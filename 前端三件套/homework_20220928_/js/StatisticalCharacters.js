let strs = [
    "America",
    "Greece",
    "Britain",
    "Canada",
    "China",
    "Egypt"
]

let result = 0;

strs.forEach(element => {
    if (element.toLowerCase().indexOf('a') != -1) {
        result++;
    }
});

console.log('含有a或A的词:', result);