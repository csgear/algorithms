/**
 * Leetcode.cn 2618. 检查是否是类的对象实例
 * @author csgear
 * @param {any} obj
 * @param {any} classFunction
 * @return {boolean}
 */
const checkIfInstanceOf = function(obj, classFunction) {
    if( (obj==null) || (typeof classFunction !== 'function')) {
        return false
    }
    return Object(obj) instanceof classFunction
};