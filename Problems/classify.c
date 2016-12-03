#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

#define FALSE 0
#define TRUE 1

void classify(int array[], int n){
  int i = 0;
  int numZeroes = 0;
  int spaceBetween = 0;
  while(i < n){
    if(array[i] == 0){
      numZeroes++;
      int x = i + 1;
      while(x < n){
	if(array[x] == 0){
	  numZeroes++;
	  spaceBetween = x - i - 1;
	  x = n;
	  i = n;
	}
	x++;
      }
    }
    i++;
  }
  if(numZeroes == 0){
    printf("a\n");
  }
  else if(numZeroes == 1){
    printf("b\n");
  }
  else if(spaceBetween % 2 == 0){
    printf("c\n");
  }
  else{
    printf("d\n");
  }
}
int main(int argc, char * argv){
  int array1[] ={1,2,4,0,3,4,0};
  int array2[] ={2,3,0,2,0};
  int array3[] ={1,2,4,0,3,4,2,3,0};
  int array4[] ={1,2,4,0,3};
  int array5[] = {1,2,0,4,3,2,0};
  classify(array1, 7);
  classify(array2, 5);
  classify(array3, 9);
  classify(array4, 5);
  classify(array5, 7);
  return EXIT_SUCCESS;
}
