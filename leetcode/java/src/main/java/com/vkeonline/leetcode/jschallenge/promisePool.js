/**
 * leetcode.cn 2636. Promise 对象池
 * @author csgear
 * @param {Function[]} functions
 * @param {number} limit
 * @return {Function}
 */
const promisePool = async function(
    functions, limit) {
    await Promise.all([...new Array(limit)].map(async () => {
        while (functions.length) {
            await functions.shift()() ;
        }
    }))
};