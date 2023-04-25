class Calculator{
public static void main(String[] args){

Calculator C = new Calculator();
// new -- allocate new memory area

 C.add();
C.sub();
C.mul(10,20);


}
void add(){
System.out.println(10+20);
}
void sub(){
System.out.println(20-10);
}

void mul(int n ,int i){
int j=n*i;
System.out.println(j);
}

}
