/**
 * leetcode.cn 2676. 节流
 * @author csgear
 * @param fn
 * @param t
 */
const throttle = function (fn, t) {
    let lastTime = 0;
    let timer = null;
    let modifiedArgs = null;
    return function (...args) {
        let now = Date.now();
        let remaining = t - (now - lastTime);
        modifiedArgs = args;
        if (remaining <= 0) {
            // 剩余时间小于等于0，说明冷却时间已到
            // 可以直接执行函数
            if (timer) {
                clearTimeout(timer);
                timer = null;
                lastTime = now;
                fn.apply(this, modifiedArgs);
            } else if (!timer) {
                // 剩余时间大于0，且定时器不存在说明冷却时间未到，且当前为队列第一个
                // 需要设置定时器，定时器时间为剩余时间，并在定时器执行后将定时器置空，更新上次执行时间
                timer = setTimeout(() => {
                    lastTime = Date.now();
                    timer = null;
                    fn.apply(this, modifiedArgs);
                }, remaining);
            }
            // 剩下一种情况是剩余时间大于0，且定时器存在，说明冷却时间未到，且当前不是队列第一个
            // 不需要设置定时器，只需要更新参数，已经在前面更新过了
        }
    }
}