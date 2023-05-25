

/**
 * leetcode.cn 2621. 睡眠函数
 * @author csgear
 * @param {number} millis
 */
async function sleep(millis) {
    await new Promise((s) => setTimeout(s,millis))
}