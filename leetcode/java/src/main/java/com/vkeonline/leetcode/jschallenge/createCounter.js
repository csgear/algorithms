/**
 * leetcode.cn 2620. 计数器
 * @param {number} n
 * @return {Function} counter
 */
const createCounter = function (n) {
    return function () {
        return n++;
    };
};