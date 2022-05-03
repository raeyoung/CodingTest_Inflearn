let answer = [];
let str = 'StuDY';
let arr = [];

for(idx in str.split('')) {
    arr.push(str.charCodeAt(idx));
};


for(var i=0 ; i<arr.length ; i++) {
    if(arr[i] >= 97 && arr[i] <= 122) answer.push(arr[i]-32);
    else answer.push(arr[i] + 32);
    // join 으로 사용해서 문자열 합치려는데 에러 발생 
    console.log(String.fromCharCode(answer[i]));
}

