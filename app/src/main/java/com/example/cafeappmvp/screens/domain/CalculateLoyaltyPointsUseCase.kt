package com.example.cafeappmvp.screens.domain

class CalculateLoyaltyPointsUseCase {
    operator fun invoke(totalSum: Double,currentPoints:Int, isSpendMode: Boolean): LoyaltyResult{
        if(isSpendMode==false)
        {
            val earnedPoints=(totalSum*0.10).toInt()
            return LoyaltyResult(totalSum,earnedPoints)
        }
        else
        {
            if(currentPoints>=totalSum){

                return LoyaltyResult(1.0,-(totalSum-1).toInt())
            }
            else{
                val nowSum=totalSum-currentPoints
                return LoyaltyResult(nowSum,-currentPoints)
            }
        }
    }
}