## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

---
### 요구사항 정리
1. 컴퓨터가 숫자를 생성해냄
   - 각 숫자는 1-9 사이
   - 세 자리 숫자로 이루어짐
   - 중복 허용하지 않음
2. 사용자에게 숫자를 입력 받음
   - 특정 자릿수에 숫자가 정확하게 맞으면 스트라이크
   - 숫자가 포함되어 있으면 볼
   - 위 두 조건에 아무것도 만족하지 않으면 낫싱
3. 사용자가 컴퓨터가 만들어낸 숫자를 맞췄는지 확인
4. 게임의 전체적인 흐름 컨트롤
   - 1을 누르면 게임 다시 시작
   - 2를 누르면 게임 완전 종료