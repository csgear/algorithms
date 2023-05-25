/**
 * leetcode.cn 2627. 函数防抖
 * @author csgear
 * @param fn
 * @param t
 * @returns {(function(...[*]): void)|*}
 */
const debounce = function(fn, t) {
    let timer = null ;
    return function(...args) {
        clearTimeout(timer) ;
        timer = setTimeout( () =>
            fn.apply(this, args), t
        )
    }
};