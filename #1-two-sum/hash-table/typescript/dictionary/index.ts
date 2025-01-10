function twoSumDictionary(nums: number[], target: number): number[] {
    const numDictionary = {};
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (numDictionary.hasOwnProperty(complement)) {
            return [numDictionary[complement], i];
        }
        numDictionary[nums[i]] = i;
    }
    return [];
}