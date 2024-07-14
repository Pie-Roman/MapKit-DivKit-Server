## MapKit DivKit Server Demo app

![Static Badge](https://img.shields.io/badge/divkit-orange?link=https%3A%2F%2Fgithub.com%2Fdivkit%2Fdivkit) ![Static Badge](https://img.shields.io/badge/mapkit-red?link=https%3A%2F%2Fyandex.ru%2Fmaps-api) ![Static Badge](https://img.shields.io/badge/spring-green)

Серверная часть приложения, демонстрирующего интеграцию библиотеки Yandex MapKit в DivKit BDUI

### Необходимые условия

- **Java Development Kit (JDK):** Рекомендуемая версия 8 или выше.
- **Gradle:** Версия 8.2 или выше.
- **DivKit:** Версия 29.15.0 или выше.

### Начало работы

#### Клонирование репозитория

```sh
git clone https://github.com/Pie-Roman/MapKit-DivKit-Server.git
cd MapKit-DivKit-Server
```

#### Сборка и запуск

- Используйте Gradle для сборки проекта.
- Запустите `MapKitApplication`
- Сервер запустится на `http://localhost:8080`

#### REST Endpoints:
- GET MapView - `http://localhost:8080/map`

### Лицензия

Этот проект лицензирован под MIT License - смотрите файл [LICENSE](LICENSE) для деталей.