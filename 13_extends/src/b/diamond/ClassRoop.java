package b.diamond;

class E // extends G 무한루프(오류) 
{}

class F extends E{}
// 조상 상속 가능
class G extends F{}

public class ClassRoop {

}
