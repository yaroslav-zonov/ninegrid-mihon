# NineGrid — Mihon Extension

Расширение для [Mihon](https://mihon.app/) (Android) для чтения комиксов с [NineGrid](https://9grid.cc).

## Установка

1. Скачайте APK из [Releases](https://github.com/yaroslav-zonov/ninegrid-mihon/releases)
2. Установите на Android-устройство
3. В Mihon: **Каталог → NineGrid**

## Возможности

- Просмотр каталога серий (по популярности, новизне, названию, году)
- Полнотекстовый поиск
- Фильтры: жанр, издатель, год
- Постраничное чтение с гео-оптимизированным CDN
- Множественные команды перевода (каждый перевод = отдельная глава)
- Синхронизация прогресса чтения (требует API-ключ)
- Deep links: ссылки `https://9grid.cc/series/123` открываются в Mihon

## Настройка

В Mihon: **Каталог → NineGrid → ⚙️**

- **URL сервера** — по умолчанию `https://9grid.cc`
- **API-ключ** — создайте на сайте: Настройки → API-ключи

API-ключ нужен только для синхронизации прогресса чтения. Без ключа каталог и чтение работают.

## Сборка из исходников

```bash
git clone https://github.com/yaroslav-zonov/ninegrid-mihon.git
cd ninegrid-mihon
./gradlew assembleDebug
# APK: build/outputs/apk/debug/
```

## OPDS (для iOS)

Если вы на iOS, используйте OPDS в приложении [Panels](https://panels.app):

```
https://9grid.cc/api/opds        — международный CDN
https://9grid.cc/api/opds-ru     — российский CDN
```
