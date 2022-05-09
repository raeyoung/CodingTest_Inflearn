// 단어 뒤집기
let str = 'good Time Big';
let answer = '';

// 1. reverse 사용
/*
answer = str.split('').reverse().join('');

console.log(answer);
*/

// 2. 직접 뒤집기
for(let i=0 ; i<str.length ; i++) {
    let s = Array.from(str);

    let lt = 0, rt = s.length-1;
    // 손코딩으로 가능하도록 직접 뒤집기
    while(lt < rt) {
        let tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
    }
    answer = s.join('');
}
console.log(answer);