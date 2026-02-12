package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @ParameterizedTest
  @MethodSource("findMaxData")
  void findMax(long[] incomesInBillions, long expected) {
    StatisticsService service = new StatisticsService();
    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> findMaxData() {
    return Stream.of(
            Arguments.of(new long[] {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12},
    12),
            Arguments.of(new long[] {12, 5, 8, 4, 5, 3, 8, 26, 11, 11, 12},
                    26)
    );
  }
}