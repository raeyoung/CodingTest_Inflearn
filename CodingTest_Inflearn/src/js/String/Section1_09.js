// 숫자만 추출하기
let str = 'g0en2T0s8eSoft';

// 1. 아스키코드 사용하기
/*
let answer = 0;
for(let idx in Array.from(str)) {
  let asc = str.charCodeAt(idx);
  if(asc>=48 && asc<=57) { //숫자
    answer = answer*10+(asc-48);
  }
}
console.log(answer);
*/

// 2. String 사용하여 parseInt 하기
let answer = '';
for(let idx in Array.from(str)) {
    if(!isNaN(str[idx])) { // isNaN : Not a Number
        answer += str[idx];
    }
}
console.log(parseInt(answer));

