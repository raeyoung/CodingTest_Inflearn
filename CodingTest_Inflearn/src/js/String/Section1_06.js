// 중복문자 제거
let str = 'ksekkset';
let answer = '';

for(let i=0 ; i<str.length ; i++) {
    // 해당 문자열이 발견된 위치와 같다면
    if(str.indexOf(str[i]) == i) {
        answer += str[i];
    }
}
console.log(answer);