# flowerstone
2025-04-30

    - 사용할 디렉토리 구성 
    - properties, bulid 파일 설정
    - 서버 및 db 연동(google cloud sql[mySql])
    - 프로퍼티 파일을 올려버려서 gitignore 수정 후 다시 올림.
2025-05-01

    서버쪽 간단한 테스트용 컨트롤러
    데이터 불러오는지 확인용도 index.html
    내일부터 vsCode로 넘어가서 퍼블리싱 > react 작업 후 다시 서버쪽으로 넘어올듯함

2025-05-22
- Add unambiguous imports on the fly
  - 설정해둬서 나중에 자동 import 관련 문제 있을 시 설정 체크 해제할 것 

- 파일 업로드 관련 컨트롤러 및 설정
  - 리액트, html 환경에서 테스트 완
  - 아직 db 연동은 해뒀는데 파일 관련 데이터베이스 만들지 않음
    - 나중에 파일관련 db 추가 후 중복 파일 처리 및 파일 삭제 관련 스케쥴러 설정
  - 파일 업로드는 일단 서버 프로젝트에 uploads에서 관리
    - 이후 구글 드라이브 or 도커 올릴 때 컨테이너 설정으로 관리

- 프록시 설정 
  - 프론트 연결 나중에 allowedHeaders 부분 ip로 변경할 것
  - 현재는 다 열어둠
