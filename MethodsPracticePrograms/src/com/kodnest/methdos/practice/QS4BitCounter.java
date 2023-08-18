package com.kodnest.methdos.practice;

public class QS4BitCounter {
int countSetBits(int a) {
	int count = 0;
    while (a != 0) {
        count += a& 1;
        a >>= 1;
    }
    return count;
}

}

