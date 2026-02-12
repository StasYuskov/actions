package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate index of max income.
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    //    long currentMaxIndex = 0;
    long currentMax = incomes[0];
    for (long income : incomes) {
      if (currentMax < income) {
        currentMax = income;
      }
    }
    return currentMax;
  }
}
