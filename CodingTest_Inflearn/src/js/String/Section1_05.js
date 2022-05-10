// 특정 문자열만 뒤집기 (영문만 뒤집기)
let str = 'a#b!GE*T@S';
let answer = '';
let pattern = /[a-zA-Z]/; //영어

for(let i=0 ; i<str.length ; i++) {
    let s = Array.from(str);

    let lt = 0, rt = s.length-1;

    while(lt < rt) {
        if(!pattern.test(s[lt])) lt++;
        else if(!pattern.test(s[rt])) rt--;
        else {  // 영문인 경우 
            let tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }
    }
    answer = s.join('');
}
console.log(answer);