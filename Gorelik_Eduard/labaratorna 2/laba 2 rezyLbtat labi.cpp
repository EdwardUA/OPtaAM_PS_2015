#include <iostream>
#include <fstream>
#include <string.h>
#include <cstdlib> // DLYA 5 11 robit
#include <math.h>
#include <algorithm>
const int N=11;
using namespace std;
void createFile(){
      ofstream file("file.txt");
      file.close();         
}
void readFile(){
      string buff;
      ifstream file("file.txt");
      while(!file.eof()){
      getline(file, buff);
      cout << buff << endl;
      }
      file.close();         
}
float addFunctionResults(){
ofstream file("file.txt",ios_base::app);
float function;
	  for(int i=0;i<N;i++)
	  {function=(sin(i)-log(i));
	  	  file << "X=" <<i<<"\t"<<"F(X)="<<function<<"\n"<<"----------------------"<<endl;
	  }}  //Zachem pisaTb 4 otdeLbnih faila esli mojno zapihnytb vse v odny
main (){
createFile();
addFunctionResults();
readFile();
     system("pause");     
}
