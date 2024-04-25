# 사용 기술
Java 17 (openJDK 17), Gradle
# 프로젝트
## 1. 게시판 카테고리 자료구조 
Category 클래스를 중심으로 게시판의 트리구조를 구현하였습니다.

 java 실행 파일 형태이며, Gradle 을 사용하여 패키징 했습니다. <br> 
 데이터베이스를 선택해 카테고리 명을 검색하면 카테고리의 상세 정보와 그 하위 카테고리 정보가 출력됩니다. <br>
 [실행방법](#실행-방법) 

### Category
트리 구조의 노드 역할을 하는 클래스 입니다. <br>
하위 카테고리를 가지고 있습니다.

### Edge
카테고리 간의 관계를 나타냅니다. <br>
parent id 와 child id 로 이루어져있습니다. 

### CategoryTree
실제 트리 구조를 생성합니다. <br>
category list 와 edge list 를 입력 받아 카테고리를 맵핑합니다.

##  실행 방법

```shell
java -jar hanteo1-1.0.0.jar 1 BTS
```
> args1 : 1 or 2 <br>
> args2 : {Category/Board} <br>
> <i>1 또는 2 중 하나의 트리를 선택하여 검색하고자 하는 "Category/Board"를 입력합니다.</i><br>
> 하나 이상의 검색 결과가 있을 때에도 검색된 모든 결과가 출력 됩니다.

### 1번 카테고리 트리

| Category1 | Category2 | Board     | Board No. |
| --------- | --------- | --------- | --------- |
| Male      | EXO       | Notice    | 1         |
|           |           | CHEN      | 2         |
|           |           | BAEKHYUN  | 3         |
|           |           | XIUMIN    | 4         |
|           | BTS       | Notice    | 5         |
|           |           | Anonymous | 6         |
|           |           | V         | 7         |
| Female    | BLACKPINK | Notice    | 8         |
|           |           | Anonymous | 6         |
|           |           | ROSE      | 9         |

### 2번 카테고리 트리

| Category1 | Category2 | Category3 | Board     | Board No. |
| --------- | --------- | --------- | --------- | --------- |
| Male      | EXO       |           | Notice    | 1         |
|           |           |           | CHEN      | 2         |
|           |           |           | BAEKHYUN  | 3         |
|           |           |           | XIUMIN    | 4         |
|           | BTS       |           | Notice    | 5         |
|           |           |           | Anonymous | 6         |
|           |           |           | V         | 7         |
|           | NCT       | NCT127    | Notice    | 18        |
|           |           |           | JAEHYUN   | 10        |
|           |           |           | MARK      | 11        |
|           |           |           | HAECHAN   | 13        |
|           |           | NCT DREAM | Notice    | 19        |
|           |           |           | MARK      | 11        |
|           |           |           | RENJUN    | 12        |
|           |           |           | HAECHAN   | 13        |
|           |           | WayV      | Notice    | 20        |
|           |           |           | TEN       | 14        |
|           |           |           | WINWIN    | 15        |
|           |           | NCT WISH  | Notice    | 21        |
|           |           |           | SION      | 16        |
|           |           |           | YUSHI     | 17        |
| Female    | BLACKPINK |           | Notice    | 8         |
|           |           |           | Anonymous | 6         |
|           |           |           | ROSE      | 9         |


## 2. 동전 조합 경우의 수

동적프로그래밍 (DP) 으로 경우의 수를 구했습니다. <br>
sumArr[] 의 정의는 현재 동전까지를 포함한 합계의 경우의 수 입니다. <br>
점화식은 sumArr[i] = sumArr[i] + sumArr[i - coin] 으로 표현할 수 있습니다.

### 결과

main 메소드 실행으로 5가지 케이스에 대한 답을 출력할 수 있습니다.