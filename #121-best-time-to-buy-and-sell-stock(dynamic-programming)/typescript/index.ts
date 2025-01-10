function maxProfit(prices: number[]): number {
    let profit = 0;
    let prev = Infinity;
    for (let i = 1; i < prices.length; i++) {
        prev = Math.min(prices[i - 1], prev);
        profit = Math.max(prices[i] - prev, profit);
    }
    return profit;
};

function maxProfit2(prices: number[]): number {
    let maxProfit = 0;
    let minPrice = Number.MAX_VALUE;

    for (let i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice;
        }
    }
    return maxProfit;
};

function maxProfit3(prices: number[]): number {

    let maxProfit = 0
    let localMin = prices[0]
    for (let i = 0; i < prices.length ; i++) {
        if (localMin > prices[i]) {
            localMin = prices[i]
        }
        
        if (prices[i] - localMin > maxProfit) {
            maxProfit = prices[i] - localMin
        }
    }
    return maxProfit
};

