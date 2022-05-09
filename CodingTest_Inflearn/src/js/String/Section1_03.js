// 문장 속 단어 찾기(가장 긴 단어 찾기)
let str = 'it is time to study';
let answer = '';

//1. split 사용
/*
let max = Number.MIN_SAFE_INTEGER;

const arr = str.split(' ');
// console.log(arr);

for(let i=0 ; i<arr.length ; i++) {
    let len = arr[i].length;
    if(len > max) {
        max = len;
        answer = arr[i];
    }
}
console.log(answer);
*/

// 2. indexOf(), subString() 사용
let max = Number.MIN_SAFE_INTEGER, pos;

while((pos = str.indexOf(" ")) != -1) {
    let tmp = str.substring(0, pos);
    let len = tmp.length;
    if(len > max) {
        max = len;
        answer = tmp;
    }
    str = str.substring(pos +1);
}
if(str.length > max) answer = str;
console.log(answer);