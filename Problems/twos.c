//This function takes in a number and returns the number of times this number can be halved before it becomes odd
//By Sean Brady

#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

int twos(int n){
  int counter = 0;
  while(n % 2 == 0){
    n = n / 2;
    counter++;
  }
  return counter;
}


int main(int argc, char * argv[]){
  assert(twos(5) == 0);
  assert(twos(6) == 1);
  assert(twos(12) == 2);
  assert(twos(20) == 2);
  assert(twos(16) == 4);
  return EXIT_SUCCESS;
}
