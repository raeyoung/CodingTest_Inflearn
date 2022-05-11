let str = 'gooG';
//let answer = 'YES';

// 1. toUpperCase 사용하여 문자열 확인
/*
str = str.toUpperCase();
let len = str.length;

for(let i=0; i<len/2 ; i++) {
  if(str[i] != str[len-i-1]) {
    answer = 'NO';
  }
}
console.log(answer);
*/

// 2. reverse 사용
let answer = 'NO';
let tmp = str.split('').reverse().join('');

// Java에서 사용한 equalsIgnoreCase 가 자바스크립에는 지원되지 않으므로 문자열을 소문자로 변경하는 toLowerCase 사용
if(str.toLowerCase(tmp)) answer = 'YES';

console.log(answer);
