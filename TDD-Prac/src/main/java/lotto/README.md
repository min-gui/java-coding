# 로또(자동)
## 기능 요구사항
- 로또 구입 금액을 입력 받는다.
- 로또 1장의 가격은 1000원이다.

1. 로또 구입 및 생성:
- 사용자에게 로또 구입 금액을 입력받아, 그에 맞는 수의 로또를 생성합니다.
- 로또 한 장의 가격은 1,000원으로 정해져 있습니다.
2. 로또 번호 생성 규칙:
- 각 로또는 1부터 45 사이의 숫자 중 6개의 고유한 숫자로 구성되어야 합니다.
- 번호는 중복되지 않고 정렬된 상태로 출력되어야 합니다.
3. 당첨 번호 입력:
- 사용자로부터 당첨 번호 6개와 보너스 번호 1개를 입력받습니다.
- 당첨 번호는 중복되지 않아야 하며, 보너스 번호도 당첨 번호와 중복되지 않아야 합니다.
4. 로또 당첨 결과 계산:
- 생성된 로또들과 당첨 번호를 비교하여 일치하는 번호의 개수를 계산합니다.
- 등수는 다음과 같이 결정됩니다:
- 6개 일치: 1등
- 4개 일치: 4등
- 3개 일치: 5등
5. 수익률 계산:
- 당첨된 로또의 상금에 따라 총 수익률을 계산합니다.
- 수익률은 (총 상금 / 로또 구입 금액) * 100으로 계산됩니다.

## 프로그래밍 요구사항
- 모든 기능을 TDD로 구현 단위 테스트 존재해야 한다.
  - UI(System.out, System.in) 로직은 제외
- 핵심 로직, UI 로직 분리
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 들여쓰기(Indent) depth 1단계로.
  - for문 안에 if문 있으면 들여쓰기 2.
  - depth를 줄이는 방법 메소드 분리
- 메소드 길이 15라인을 넘어가지 않도록.
- 메소드 단일책임 원칙 한가지 일만 잘 하다록 구현
- 자바 코드 컨벤션을 지켜라.
  - https://google.github.io/styleguide/javaguide.html
  - https://github.com/villainscode/coding-guide
- else 예약어를 쓰지 마라.
  - if 조건절에서 값을 return 하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  - switch/case도 허용하지 않는다.

## 입출력 예시
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]
지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```