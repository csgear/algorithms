/**
 * Leetcode.cn 2628. 完全相等的 JSON 字符串
 * @author csgear
 * @param o1 Object1
 * @param o2 Object2
 * @returns two objects are deeply equal {boolean}
 */
const areDeeplyEqual = function (o1, o2) {
    if (typeof o1 === "object" && o1 != null &&
        (Object.prototype.toString.call(o1) === Object.prototype.toString.call(o2))
    ){
        if(Object.keys(o1).length !== Object.keys(o2).length) {
            return false ;
        }
        let result = true ;
        for(const key in o1) {
            if(Object.hasOwnProperty.call(o1, key) &&
                Object.hasOwnProperty.call(o2, key)) {
                result = result & areDeeplyEqual(o1[key], o2[key]) ;
            }
            else {
                return false ;
            }
        }
        return result ;
    }

    return o1 === o2 ;
}