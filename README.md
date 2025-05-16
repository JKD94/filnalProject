# oHo (오호) 🎤🎶

**oHo**는 팬 커뮤니티 플랫폼으로, 위버스(Weverse) 스타일의 UI/UX를 구현한 JSP 기반의 웹 애플리케이션입니다. 아티스트와 팬 간의 소통, 게시글 공유, 일정 관리 등 다양한 기능을 제공하여 팬덤 경험을 한층 풍성하게 만듭니다.

## 🛠️ 기술 스택

- **Backend**: Java, Spring Framework, Spring Security, MyBatis
- **Frontend**: JSP, HTML5, CSS3, JavaScript (ES6), Bootstrap 5
- **Database**: Oracle
- **라이브러리 및 도구**
  - Axios (비동기 통신)
  - Swiper.js (카드 슬라이더)
  - FullCalendar.js (일정 관리)
  - JSTL
  - WebSocket (실시간 데이터)

## ✨ 주요 기능

### 📋 게시판 & 댓글
- 위버스 스타일 게시글 UI
- 좋아요, 댓글 등록/삭제, 댓글 모달 뷰
- 댓글 등록 후 실시간 반영 (모달 재호출 시 최신 데이터 보임)

### 👤 프로필 페이지
- 팔로우 / 언팔로우 기능
- 팔로잉 리스트 모달
- 탭 기반 게시글 / 댓글 내역 확인
- 이미지 확대 기능 포함

### 📅 아티스트 일정 관리
- 드래그 앤 드롭 가능한 FullCalendar 연동
- 이벤트 클릭 시 모달창을 통한 상세정보 수정 및 확인 가능
- 일정을 효과적으로 시각화하고 관리 가능

### 📡 실시간 슬라이더
- Swiper 기반 아티스트 카드 슬라이더
- WebSocket으로 실시간 데이터 수신 및 렌더링

## 📷 UI 미리보기
> (여기에 프로젝트 실행 화면 스크린샷을 추가하세요)

## 🏃‍♂️ 실행 방법

1. 프로젝트 클론
   ```bash
   git clone https://github.com/your-username/oHo.git
