/**
 * @author csgear
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
const timeLimit = function(fn, t) {
    return async function (...args) {
        return Promise.race([
            fn(...args),
            new Promise(((_, reject) =>
                setTimeout(() => reject('Time Limit Exceeded'), t)))
        ])
    }
};
