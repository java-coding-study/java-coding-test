# 자바 코딩 테스트 

# 1.입출력 규칙
## 입력
- 콘솔 입력: Scanner보다 BufferedReader + StringTokenizer를 권장
(속도 차이 때문에, 대량 입력 시 Scanner는 시간 초과 가능성 높음)
-입력 데이터 크기가 크면 readLine() 기반 처리 후 파싱

## 출력
-System.out.println()보다 StringBuilder에 모아두고 한 번에 출력
-불필요한 공백, 줄바꿈 주의

# 2. 시간 복잡도 & 메모리 제한

-보통 1초에 약 1억 번 연산 가능하다고 가정
-O(N²)는 N이 5천~1만 넘어가면 위험
-메모리는 보통 128MB~512MB 제한, 대형 배열 생성 시 조심
-int vs long 범위 체크 (특히 곱셈/나눗셈 시)
