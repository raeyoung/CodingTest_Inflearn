// 1. 문자 찾기
let answer = 0;
let str = "Computercooler".toUpperCase();   // 대문자로 변경
let c = "c".toUpperCase();                  // 대문자로 변경

for(idx in Array.from(str)) {               // 문자열 배열로 변환
    if(str[idx] == c) answer++;
}

console.log(answer);