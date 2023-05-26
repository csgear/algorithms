/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
const chunk = function(arr, size) {
    let lastIndex=0;
    const newArr=[]
    while(lastIndex < arr.length) {
        newArr.push(arr.slice(lastIndex,lastIndex+size))
        lastIndex+=size;
    }
    return newArr ;
}