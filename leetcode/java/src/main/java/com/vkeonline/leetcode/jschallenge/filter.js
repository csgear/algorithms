/**
 * leetcode.cn 2634. 过滤数组中的元素
 * @author csgear
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
const filter = function(arr, fn) {
    let result = [] ;
    for(const [i,v] of arr.entries()){
        if(fn(v,i)) {
            result.push(v)
        }
    }
    return result ;
};