// 팰린드롬 (앞으로 읽으나 뒤로 읽으나 동일한 문자열)
let str = 'found7, time: study; Yduts; emit, 7Dnuof';

for(let i=0 ; i<str.length/2 ; i++) {
    let lt = str[i];
    let rt = str[str.length-i-1];
    if(lt != rt) {
        answer = 'NO';
    }
}
answer = 'YES';

console.log(answer);