// 문장 속 단어 찾기(가장 긴 단어 찾기)
const str = 'it is time to study';
let answer = '';

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