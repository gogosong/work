package collection;

public class CollectionFrameTest {
	/* 
	 * 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해놓은 java.util 패키지에 구현된 라ㅏ이브러린 개발기간을 단축하고 최적화된
	 * 라이브러리를 사용할 수 있다. Collection인터페이스와 Map 인터페이스로 구성
	 Collection:하나의 객체에 대한 (List(ArrayList, Vector,LinkedList),
	  Set(MAp:쌍으로 ㄱ 객체 관리 key-value t)
	 
	 *자료구조:
	 *Array:연속된 선형 자료구조, 데이터논리적구조와 물리족 구조가 동일하다. 데이터 삽입 삭제시 ,=>ArrayList,Vector
	 *Linked List:링크만 조정하면 된다.자료 변동이 심할대 =>LinkedList 라이브러리로 제공
	 *stack : 위로 쌓여있는 자료구조 =>ArrayList, Vector, Stack 구현해서 사용한다.
	 *Queue : First In FirstOut, front, rear, 들어가는 오퍼레이션을 enqueue, 나오는 오퍼레이션을 dequeue()
	 *hash는 검색을 위한 자료구조이다. index = hash(key), key를 주면  index를 준다. key는 중복되지 않는다.
	 *극장에 좌석이 0번부터 99번까지 있는데 표를 1번부터 300번까지 표를 팔았다면 15번이 영화를 보러왔다면 나머지 연산자를 쓰서 15를 100으로 나눈 나머지
	 *115%100 => 나머지는 15이다 이미 앉아있으면 콜리젼이 발생한다 충돌이 발생한다.
	 *자바에서 hashSet hashMap은 약 75% 차면 뻥티귀한다. => 검색기반 빨리 데이터를 찾기위한 거다.
	 *binaryTree는 paren아래에 child가 두개보다 작은거
	 *BST binarySearchTree: 처음데이터를 넣고 비교조건에의해서 작은것은 leftchild , 나보다 크면 righchild이다
	 */
	public static void main(String[] args) {
		//제널릭 프로그래밍: 자바5부터 나온 프로그래밍 방식이다.
		//제너릭 프로그래밍이 컬렉션 프레임웍에 적용 되어있다. 
		/*
		 * 변수를 선언할때 데이터 타입을 선언하면 데이터 타입에 해당하는 자료만 사용할 수 있다 어떤 변수가 여러 타입으로 변경되어 사용될수
		 * 잇다.이때 사용하는 참조 자료형은는 실제 클래스를 쓸대 자료형을 결정한다.컴파일러가 건븡하므로 안전하게 사용할 수 있다.
		 * 
		 * 자료형 매개변수라 = <T> 재료에 타입을 제너릭으로 두고 T가 플라스틱이냐 파우더이냐
		 */
		
		
	}

}
