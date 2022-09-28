calculate = (a, b, symbol) => {
  a = parseFloat(a);
  b = parseFloat(b);
  switch (symbol) {
    case "+":
      return a + b;
    case "-":
      return a - b;
    case "*":
      return a * b;
    case "/":
      return a / b;
    case "%":
      return a % b;
  }
};

window.onload = () => {
  const inputNum = prompt("请输入第一个数:");
  const inputSymbol = prompt("请输入计算方式:");
  const inputNum2 = prompt("请输入第二个数:");
  alert("计算结果:", this.calculate(inputNum, inputNum2, inputSymbol));
};
