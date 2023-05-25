/**
 * Leetcode.cn 2633. 将对象转换为 JSON 字符串
 * @author csgear
 * @param object an object
 * @returns json string represents the object {number|boolean|string}
 */
const jsonStringify = function(object) {
    if (typeof object === "string") {
        return `"${object}"` ;
    }

    if (typeof object === "number" || typeof  object === "boolean" ||
        object === null) {
        return object ;
    }

    if(Array.isArray(object)) {
        const items = [] ;
        for(const item of object) {
            items.push(`${jsonStringify(item)}`) ;
        }
        return `[${items.join(",")}]`
    }

    const items = [] ;
    for(const key of Object.keys(object)) {
        items.push(`"${key}":${jsonStringify(object[key])}`) ;
    }
    return`{${items.join(",")}}`
}