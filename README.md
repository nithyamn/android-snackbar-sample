# android-snackbar-sample

## Snackbar vs Toast

Snackbars contain a single line of text directly related to the operation performed. They may contain a text action, but no icons.

Toasts (Android only) are primarily used for system messaging. They also display at the bottom of the screen, but may not be swiped off-screen.

## How to debug elements on Snackbar

- Use Snackbar.LENGTH_INDEFINITE instead of Snackbar.LENGTH_LONG or Snackbar.LENGTH_SHORT as the duration. This will keep the snackbar on screen until next snackbar is displayed or this snackbar is explicitly dismissed.

## Reference
- https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar
- https://www.journaldev.com/10324/android-snackbar-example-tutorial
