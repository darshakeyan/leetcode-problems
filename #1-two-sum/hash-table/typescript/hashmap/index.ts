// Brute Force Approach

function twoSumHashmap(nums: number[], target: number): number[]  {
    let hashMap = new Map();
    for (let i = 0; i < nums.length; i++) {
        let neededNumber = target - nums[i];
        if (hashMap.has(neededNumber)) {
            return [i, hashMap.get(neededNumber)]
        }
        hashMap.set(nums[i], i);
    }
    return [];
};