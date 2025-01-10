let slideIndex = 0;
showSlides();

function showSlides() {
  let slides = document.querySelector(".slides");
  let totalSlides = document.querySelectorAll(".slide").length;

  slideIndex++;

  if (slideIndex >= totalSlides) {
    slideIndex = 0;
  }

  let slideWidth = document.querySelector(".slides").clientWidth;
  slides.style.transform = `translateX(${-slideIndex * slideWidth}px)`; // 해당 길이만큼 슬라이드를 옆으로이동

  setTimeout(showSlides, 4000); // 4초마다 슬라이드 변경
}