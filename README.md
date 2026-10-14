# Step Counter (Java, native Android)

Open this folder in Android Studio (File > Open). Let it sync; it generates the Gradle wrapper.

## Structure
- `app/src/main/java/com/jeancarlo/stepcounter/service` - foreground service, boot receiver, watchdog (Step 2)
- `.../data` - Room entities, DAO, repository (Step 3)
- `.../ui` - activity, ViewModel, charts (Step 4)

## Status
- [x] Step 1: manifest, Gradle, dark theme
- [ ] Step 2: service architecture
- [ ] Step 3: data pipeline
- [ ] Step 4: UI binding
