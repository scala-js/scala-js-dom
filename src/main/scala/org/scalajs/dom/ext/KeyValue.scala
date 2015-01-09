package org.scalajs.dom.ext

/**
 * The KeyboardEvent.key attribute of an event must always contain one of these control key or character values (even if
 * the value is 'Unidentified').
 *
 * If the key represents one of the set of printable control characters which has a Unicode character entry, such as the
 * tab key, the KeyboardEvent.key attribute must have the key value (e.g., 'Tab').
 *
 * Implementations that are unable to identify a key must use the key value 'Unidentified'.
 *
 * Taken from http://www.w3.org/TR/DOM-Level-3-Events/#keys-special
 */
object KeyValue {

  // ===================================================================================================================
  // 6.3.1 Special Key Values

  /** This key value is used when an implementation is unable to identify another key value, due to either hardware, platform, or software constraints. */
  final val Unidentified = "Unidentified"

  // ===================================================================================================================
  // 6.3.2 Modifier Keys

  /** The Alternative (Alt, Option, Menu) key. Enable alternate modifier function for interpreting concurrent or subsequent keyboard input. This key value is also used for the Apple 'Option' key. */
  final val Alt = "Alt"

  /** The Alternate Graphics (AltGr or AltGraph) key. This key is used enable the ISO Level 3 shift modifier (the standard 'Shift' key is the level 2 modifier). */
  final val AltGraph = "AltGraph"

  /** The Caps Lock (Capital) key. Toggle capital character lock function for interpreting subsequent keyboard input event. */
  final val CapsLock = "CapsLock"

  /** The Control (Ctrl) key, to enable control modifier function for interpreting concurrent or subsequent keyboard input. */
  final val Control = "Control"

  /** The Function switch (Fn) key. Activating this key simultaneously with another key changes that key's value to an alternate character or function. This key is often handled directly in the keyboard hardware and does not usually generate key events. */
  final val Fn = "Fn"

  /** The Function-Lock (FnLock, F-Lock) key. Activating this key switches the mode of the keyboard to changes some keys' values to an alternate character or function. This key is often handled directly in the keyboard hardware and does not usually generate key events. */
  final val FnLock = "FnLock"

  /** The Hyper key. */
  final val Hyper = "Hyper"

  /** The Meta key, to enable meta modifier function for interpreting concurrent or subsequent keyboard input. This key value is also used for the Apple 'Command' key. */
  final val Meta = "Meta"

  /** The Number Lock key, to toggle numer-pad mode function for interpreting subsequent keyboard input. */
  final val NumLock = "NumLock"

  /** The operating system key (e.g. the Windows Logo key). */
  final val OS = "OS"

  /** The Shift key, to enable shift modifier function for interpreting concurrent or subsequent keyboard input. */
  final val Shift = "Shift"

  /** The Super key. */
  final val Super = "Super"

  /** The Symbol modifier key (used on some virtual keyboards). */
  final val Symbol = "Symbol"

  /** The Symbol Lock key. */
  final val SymbolLock = "SymbolLock"

  // ===================================================================================================================
  // 6.3.3 Whitespace Keys

  /** The Enter key, to activate current selection or accept current input. This key value is also used for the 'Return' (Macintosh numpad) key. */
  final val Enter = "Enter"

  /** The Separator key, for context-sensitive text separators. */
  final val Separator = "Separator"

  /** The Horizontal Tabulation (Tab) key. */
  final val Tab = "Tab"

  final val Spacebar = " "

  // ===================================================================================================================
  // 6.3.4 Navigation Keys

  /** The down arrow key, to navigate or traverse downward. */
  final val ArrowDown = "ArrowDown"

  /** The left arrow key, to navigate or traverse leftward. */
  final val ArrowLeft = "ArrowLeft"

  /** The right arrow key, to navigate or traverse rightward. */
  final val ArrowRight = "ArrowRight"

  /** The up arrow key, to navigate or traverse upward. */
  final val ArrowUp = "ArrowUp"

  /** The End key, used with keyboard entry to go to the end of content. */
  final val End = "End"

  /** The Home key, used with keyboard entry, to go to start of content. */
  final val Home = "Home"

  /** The Page Down key, to scroll down or display next page of content. */
  final val PageDown = "PageDown"

  /** The Page Up key, to scroll up or display previous page of content. */
  final val PageUp = "PageUp"

  // ===================================================================================================================
  // 6.3.5 Editing Keys

  /** The Backspace key. This key value is also used for the key labeled 'delete' on MacOS keyboards. */
  final val Backspace = "Backspace"

  /** The Clear key, for removing current selected input. */
  final val Clear = "Clear"

  /** The Copy key. */
  final val Copy = "Copy"

  /** The Cursor Select (Crsel) key. */
  final val CrSel = "CrSel"

  /** The Cut key. */
  final val Cut = "Cut"

  /** The Delete (Del) Key. This key value is also used for the key labeled 'delete' on MacOS keyboards when modified by the 'Fn' key. */
  final val Delete = "Delete"

  /** The Erase to End of Field key. This key deletes all characters from the current cursor position to the end of the current field. */
  final val EraseEof = "EraseEof"

  /** The Extend Selection (Exsel) key. */
  final val ExSel = "ExSel"

  /** The Insert (Ins) key, to toggle between text modes for insertion or overtyping. */
  final val Insert = "Insert"

  /** The Paste key. */
  final val Paste = "Paste"

  /** The Redo key. */
  final val Redo = "Redo"

  /** The Undo key. */
  final val Undo = "Undo"

  // ===================================================================================================================
  // 6.3.6 UI Keys

  /** The Accept (Commit, OK) key. Accept current option or input method sequence conversion. */
  final val Accept = "Accept"

  /** The Again key, to redo or repeat an action. */
  final val Again = "Again"

  /** The Attention (Attn) key. */
  final val Attn = "Attn"

  /** The Cancel key. */
  final val Cancel = "Cancel"

  /** Show the application's context menu. This key is commonly found between the right 'OS' key and the right 'Control' key. */
  final val ContextMenu = "ContextMenu"

  /** The Escape (Esc) key, to initiate an escape sequence. */
  final val Escape = "Escape"

  /** The Execute key. */
  final val Execute = "Execute"

  /** The Find key. */
  final val Find = "Find"

  /** Toggle display of help information. */
  final val Help = "Help"

  /**
   * Pause the current state or application (as appropriate).
   *
   * Note: Do not use this value for the pause button on media controllers. Use 'MediaPause' instead.
   */
  final val Pause = "Pause"

  /**
   * Play or resume the current state or application (as appropriate).
   *
   * Note: Do not use this value for the play button on media controllers. Use 'MediaPlay' instead.
   */
  final val Play = "Play"

  /** The properties (Props) key. */
  final val Props = "Props"

  /** The Scroll Lock key, to toggle between scrolling and cursor movement modes. */
  final val ScrollLock = "ScrollLock"

  /** The ZoomIn key. */
  final val ZoomIn = "ZoomIn"

  /** The ZoomOut key. */
  final val ZoomOut = "ZoomOut"

  // ===================================================================================================================
  // 6.3.7 Device Keys

  object Device {

    /** The Brightness Down key. Typically controls the display brightness. */
    final val BrightnessDown = "BrightnessDown"

    /** The Brightness Up key. Typically controls the display brightness. */
    final val BrightnessUp = "BrightnessUp"

    /** The Camera key. */
    final val Camera = "Camera"

    /** Toggle removable media to eject (open) and insert (close) state. */
    final val Eject = "Eject"

    /** The LogOff key. */
    final val LogOff = "LogOff"

    /**
     * Toggle power state.
     *
     * Note: Some devices might not expose this key to the operating environment.
     */
    final val Power = "Power"

    /** The PowerOff key. Sometime called "PowerDown". */
    final val PowerOff = "PowerOff"

    /** The Print Screen (PrintScrn, SnapShot) key, to initiate print-screen function. */
    final val PrintScreen = "PrintScreen"

    /** The Hibernate key. This key saves the current state of the computer to disk so that it can be restored. The computer will then shutdown. */
    final val Hibernate = "Hibernate"

    /** The Standby key. This key turns off the display and places the computer into a low-power mode without completely shutting down. It is sometimes called the "Suspend" or "Sleep" key. */
    final val Standby = "Standby"

    /** The WakeUp key. */
    final val WakeUp = "WakeUp"
  }

  // ===================================================================================================================
  // 6.3.8 IME and Composition Keys

  object IME {

    /** The All Candidates key, to initate the multi-candidate mode. */
    final val AllCandidates = "AllCandidates"

    /** The Alphanumeric key. */
    final val Alphanumeric = "Alphanumeric"

    /** The Code Input key, to initiate the Code Input mode to allow characters to be entered by their code points. */
    final val CodeInput = "CodeInput"

    /** The Compose key, also known as Multi_key on the X Window System. This key acts in a manner similar to a dead key, triggering a mode where subsequent key presses are combined to produce a different character. */
    final val Compose = "Compose"

    /** The Convert key, to convert the current input method sequence. */
    final val Convert = "Convert"

    /** The Final Mode (Final) key used on some Asian keyboards, to enable the final mode for IMEs. */
    final val FinalMode = "FinalMode"

    /** Switch to the first character group. (ISO/IEC 9995) */
    final val GroupFirst = "GroupFirst"

    /** Switch to the last character group. (ISO/IEC 9995) */
    final val GroupLast = "GroupLast"

    /** Switch to the next character group. (ISO/IEC 9995) */
    final val GroupNext = "GroupNext"

    /** Switch to the previous character group. (ISO/IEC 9995) */
    final val GroupPrevious = "GroupPrevious"

    /** The Mode Change key, to toggle between or cycle through input modes of IMEs. */
    final val ModeChange = "ModeChange"

    /** The Next Candidate function key. */
    final val NextCandidate = "NextCandidate"

    /** The Nonconvert (Don't Convert) key, to accept current input method sequence without conversion in IMEs. */
    final val NonConvert = "NonConvert"

    /** The Previous Candidate function key. */
    final val PreviousCandidate = "PreviousCandidate"

    /** The Process key. */
    final val Process = "Process"

    /** The Single Candidate function key. */
    final val SingleCandidate = "SingleCandidate"

    // Keys specific to Korean keyboards

    /** The Roman Characters function key, also known as the 'Youngja' or 'Young' key. */
    final val RomanCharacters = "RomanCharacters"

    /** The Hangul (Korean characters) Mode key, to toggle between Hangul and English modes. */
    final val HangulMode = "HangulMode"

    /** The Hanja (Korean characters) Mode key. */
    final val HanjaMode = "HanjaMode"

    /** The Junja (Korean characters) Mode key. */
    final val JunjaMode = "JunjaMode"

    // Keys specific to Japanese keyboards

    /** The Zenkaku (Full-Width) Characters key. */
    final val Zenkaku = "Zenkaku"

    /** The (Half-Width) Characters key. */
    final val Hankaku = "Hankaku"

    /** The Zenkaku/Hankaku (full-width/half-width) toggle key. */
    final val ZenkakuHankaku = "ZenkakuHankaku"

    /** The Kana Mode (Kana Lock) key. */
    final val KanaMode = "KanaMode"

    /** The Kanji (Japanese name for ideographic characters of Chinese origin) Mode key. */
    final val KanjiMode = "KanjiMode"

    /** The Hiragana (Japanese Kana characters) key. */
    final val Hiragana = "Hiragana"

    /** The Katakana (Japanese Kana characters) key. */
    final val Katakana = "Katakana"

    /** The Hiragana/Katakana toggle key. */
    final val HiraganaKatakana = "HiraganaKatakana"

    /** The Eisu key. This key may close the IME, but it's purpose is defined by the current IME. */
    final val Eisu = "Eisu"
  }

  // ===================================================================================================================
  // General-Purpose Function Keys

  /** The F1 key, a general purpose function key, as index 1. */
  final val F1 = "F1"

  /** The F2 key, a general purpose function key, as index 2. */
  final val F2 = "F2"

  /** The F3 key, a general purpose function key, as index 3. */
  final val F3 = "F3"

  /** The F4 key, a general purpose function key, as index 4. */
  final val F4 = "F4"

  /** The F5 key, a general purpose function key, as index 5. */
  final val F5 = "F5"

  /** The F6 key, a general purpose function key, as index 6. */
  final val F6 = "F6"

  /** The F7 key, a general purpose function key, as index 7. */
  final val F7 = "F7"

  /** The F8 key, a general purpose function key, as index 8. */
  final val F8 = "F8"

  /** The F9 key, a general purpose function key, as index 9. */
  final val F9 = "F9"

  /** The F10 key, a general purpose function key, as index 10. */
  final val F10 = "F10"

  /** The F11 key, a general purpose function key, as index 11. */
  final val F11 = "F11"

  /** The F12 key, a general purpose function key, as index 12. */
  final val F12 = "F12"

  /** General purpose virtual function key, as index 1. */
  final val Soft1 = "Soft1"

  /** General purpose virtual function key, as index 2. */
  final val Soft2 = "Soft2"

  /** General purpose virtual function key, as index 3. */
  final val Soft3 = "Soft3"

  /** General purpose virtual function key, as index 4. */
  final val Soft4 = "Soft4"

  // ===================================================================================================================
  // Mediamedia Keys

  object Multimedia {

    /** Close the current document or message. */
    final val Close = "Close"

    /** Open an editor to forward the current message. */
    final val MailForward = "MailForward"

    /** Open an editor to reply to the current message. */
    final val MailReply = "MailReply"

    /** Send the current message. */
    final val MailSend = "MailSend"

    /** Toggle media between play and pause states. */
    final val MediaPlayPause = "MediaPlayPause"

    /** Select media. */
    final val MediaSelect = "MediaSelect"

    /** Stop media playing, pausing, forwarding, rewinding, or recording, if not already stopped. */
    final val MediaStop = "MediaStop"

    /** Seek to next media or program track. */
    final val MediaTrackNext = "MediaTrackNext"

    /** Seek to previous media or program track. */
    final val MediaTrackPrevious = "MediaTrackPrevious"

    /** Open a new document or message. */
    final val New = "New"

    /** Open an existing document or message. */
    final val Open = "Open"

    /** Print the current document or message. */
    final val Print = "Print"

    /** Save the current document or message. */
    final val Save = "Save"

    /** Spellcheck the current document or selection. */
    final val SpellCheck = "SpellCheck"

    /** Decrease audio volume. */
    final val VolumeDown = "VolumeDown"

    /** Increase audio volume. */
    final val VolumeUp = "VolumeUp"

    /** Toggle between muted state and prior volume level. */
    final val VolumeMute = "VolumeMute"
  }

  // ===================================================================================================================
  // Application Keys

  object Application {

    /** The 'Calculator' key. This is often the generic 'LaunchApplication' key, as index 2. */
    final val LaunchCalculator = "LaunchCalculator"

    /** The 'Calendar' key. */
    final val LaunchCalendar = "LaunchCalendar"

    /** The 'Mail' key. */
    final val LaunchMail = "LaunchMail"

    /** The 'Media Player' key. */
    final val LaunchMediaPlayer = "LaunchMediaPlayer"

    /** The 'Music Player' key. */
    final val LaunchMusicPlayer = "LaunchMusicPlayer"

    /** The 'My Computer' key. This is often the generic 'LaunchApplication' key, as index 1. */
    final val LaunchMyComputer = "LaunchMyComputer"

    /** The 'Screen Saver' key. */
    final val LaunchScreenSaver = "LaunchScreenSaver"

    /** The 'Spreadsheet' key. */
    final val LaunchSpreadsheet = "LaunchSpreadsheet"

    /** The 'Web Browser' key. */
    final val LaunchWebBrowser = "LaunchWebBrowser"

    /** The 'WebCam' key. */
    final val LaunchWebCam = "LaunchWebCam"

    /** The 'Word Processor' key. */
    final val LaunchWordProcessor = "LaunchWordProcessor"
  }

  // ===================================================================================================================
  // Browser Keys

  /** Navigate to previous content or page in current history. */
  final val BrowserBack = "BrowserBack"

  /** The Browser Favorites key. */
  final val BrowserFavorites = "BrowserFavorites"

  /** Navigate to next content or page in current history. */
  final val BrowserForward = "BrowserForward"

  /** The Browser Home key, used with keyboard entry, to go to the home page. */
  final val BrowserHome = "BrowserHome"

  /** The Browser Refresh key, to refresh the current page or content. */
  final val BrowserRefresh = "BrowserRefresh"

  /** The Browser Search key, to call up the user's preferred search page. */
  final val BrowserSearch = "BrowserSearch"

  /** The Browser Stop key, to stop loading the current page or content. */
  final val BrowserStop = "BrowserStop"

  // ===================================================================================================================
  // Media Controller Keys

  object MediaControl {

    /** Adjust audio balance leftward. (VK_AUDIO_BALANCE_LEFT) */
    final val AudioBalanceLeft = "AudioBalanceLeft"

    /** Adjust audio balance rightward. (VK_AUDIO_BALANCE_RIGHT) */
    final val AudioBalanceRight = "AudioBalanceRight"

    /** Decrease audio bass boost or cycle down through bass boost states. (VK_BASS_BOOST_DOWN) */
    final val AudioBassBoostDown = "AudioBassBoostDown"

    /** Increase audio bass boost or cycle up through bass boost states. (VK_BASS_BOOST_UP) */
    final val AudioBassBoostUp = "AudioBassBoostUp"

    /** Adjust audio fader towards front. (VK_FADER_FRONT) */
    final val AudioFaderFront = "AudioFaderFront"

    /** Adjust audio fader towards rear. (VK_FADER_REAR) */
    final val AudioFaderRear = "AudioFaderRear"

    /** Advance surround audio mode to next available mode. (VK_SURROUND_MODE_NEXT) */
    final val AudioSurroundModeNext = "AudioSurroundModeNext"

    /** Select next (numerically or logically) lower channel. (VK_CHANNEL_DOWN) */
    final val ChannelDown = "ChannelDown"

    /** Select next (numerically or logically) higher channel. (VK_CHANNEL_UP) */
    final val ChannelUp = "ChannelUp"

    /** General purpose color-coded media function key, as index 0 (red). (VK_COLORED_KEY_0) */
    final val ColorF0Red = "ColorF0Red"

    /** General purpose color-coded media function key, as index 1 (green). (VK_COLORED_KEY_1) */
    final val ColorF1Green = "ColorF1Green"

    /** General purpose color-coded media function key, as index 2 (yellow). (VK_COLORED_KEY_2) */
    final val ColorF2Yellow = "ColorF2Yellow"

    /** General purpose color-coded media function key, as index 3 (blue). (VK_COLORED_KEY_3) */
    final val ColorF3Blue = "ColorF3Blue"

    /** General purpose color-coded media function key, as index 4 (grey). (VK_COLORED_KEY_4) */
    final val ColorF4Grey = "ColorF4Grey"

    /** General purpose color-coded media function key, as index 5 (brown). (VK_COLORED_KEY_5) */
    final val ColorF5Brown = "ColorF5Brown"

    /** Toggle the display of Closed Captions. (VK_CC) */
    final val ClosedCaptionToggle = "ClosedCaptionToggle"

    /** Adjust brightness of device, by toggling between or cycling through states. (VK_DIMMER) */
    final val Dimmer = "Dimmer"

    /** Swap video sources. (VK_DISPLAY_SWAP) */
    final val DisplaySwap = "DisplaySwap"

    /** Exit the current application. (VK_EXIT) */
    final val Exit = "Exit"

    /** Clear program or content stored as favorite 0. (VK_CLEAR_FAVORITE_0) */
    final val FavoriteClear0 = "FavoriteClear0"

    /** Clear program or content stored as favorite 1. (VK_CLEAR_FAVORITE_1) */
    final val FavoriteClear1 = "FavoriteClear1"

    /** Clear program or content stored as favorite 2. (VK_CLEAR_FAVORITE_2) */
    final val FavoriteClear2 = "FavoriteClear2"

    /** Clear program or content stored as favorite 3. (VK_CLEAR_FAVORITE_3) */
    final val FavoriteClear3 = "FavoriteClear3"

    /** Select (recall) program or content stored as favorite 0. (VK_RECALL_FAVORITE_0) */
    final val FavoriteRecall0 = "FavoriteRecall0"

    /** Select (recall) program or content stored as favorite 1. (VK_RECALL_FAVORITE_1) */
    final val FavoriteRecall1 = "FavoriteRecall1"

    /** Select (recall) program or content stored as favorite 2. (VK_RECALL_FAVORITE_2) */
    final val FavoriteRecall2 = "FavoriteRecall2"

    /** Select (recall) program or content stored as favorite 3. (VK_RECALL_FAVORITE_3) */
    final val FavoriteRecall3 = "FavoriteRecall3"

    /** Store current program or content as favorite 0. (VK_STORE_FAVORITE_0) */
    final val FavoriteStore0 = "FavoriteStore0"

    /** Store current program or content as favorite 1. (VK_STORE_FAVORITE_1) */
    final val FavoriteStore1 = "FavoriteStore1"

    /** Store current program or content as favorite 2. (VK_STORE_FAVORITE_2) */
    final val FavoriteStore2 = "FavoriteStore2"

    /** Store current program or content as favorite 3. (VK_STORE_FAVORITE_3) */
    final val FavoriteStore3 = "FavoriteStore3"

    /** Toggle display of program or content guide. (VK_GUIDE) */
    final val Guide = "Guide"

    /** If guide is active and displayed, then display next day's content. (VK_NEXT_DAY) */
    final val GuideNextDay = "GuideNextDay"

    /** If guide is active and displayed, then display previous day's content. (VK_PREV_DAY) */
    final val GuidePreviousDay = "GuidePreviousDay"

    /** Toggle display of information about currently selected context or media. (VK_INFO) */
    final val Info = "Info"

    /** Toggle instant replay. (VK_INSTANT_REPLAY) */
    final val InstantReplay = "InstantReplay"

    /** Launch linked content, if available and appropriate. (VK_LINK) */
    final val Link = "Link"

    /** List the current program. (VK_LIST) */
    final val ListProgram = "ListProgram"

    /** Toggle display listing of currently available live content or programs. (VK_LIVE) */
    final val LiveContent = "LiveContent"

    /** Lock or unlock current content or program. (VK_LOCK) */
    final val Lock = "Lock"

    /**
     * Show a list of media applications. (VK_APPS)
     *
     * Note: Do not confuse this key value with the Windows' VK_APPS / VK_CONTEXT_MENU key, which is encoded as 'ContextMenu'.
     */
    final val MediaApps = "MediaApps"

    /** Initiate or continue forward playback at faster than normal speed, or increase speed if already fast forwarding. (VK_FAST_FWD) */
    final val MediaFastForward = "MediaFastForward"

    /** Select previously selected channel or media. (VK_LAST) */
    final val MediaLast = "MediaLast"

    /**
     * Pause the currently playing media. (VK_PAUSE)
     *
     * Note: Media controller devices should use this value rather than 'Pause' for their pause keys.
     */
    final val MediaPause = "MediaPause"

    /** Initiate or continue media playback at normal speed, if not currently playing at normal speed. (VK_PLAY) */
    final val MediaPlay = "MediaPlay"

    /** Initiate or resume recording of currently selected media. (VK_RECORD) */
    final val MediaRecord = "MediaRecord"

    /** Initiate or continue reverse playback at faster than normal speed, or increase speed if already rewinding. (VK_REWIND) */
    final val MediaRewind = "MediaRewind"

    /** Skip forward to next content or program. (VK_SKIP) */
    final val MediaSkip = "MediaSkip"

    /** Cycle to next favorite channel (in favorites list). (VK_NEXT_FAVORITE_CHANNEL) */
    final val NextFavoriteChannel = "NextFavoriteChannel"

    /** Cycle to next user profile (if there are multiple user profiles). (VK_USER) */
    final val NextUserProfile = "NextUserProfile"

    /** Access on-demand content or programs. (VK_ON_DEMAND) */
    final val OnDemand = "OnDemand"

    /** Move picture-in-picture window down. (VK_PINP_DOWN) */
    final val PinPDown = "PinPDown"

    /** Move picture-in-picture window. (VK_PINP_MOVE) */
    final val PinPMove = "PinPMove"

    /** Toggle display of picture-in-picture window. (VK_PINP_TOGGLE) */
    final val PinPToggle = "PinPToggle"

    /** Move picture-in-picture window up. (VK_PINP_UP) */
    final val PinPUp = "PinPUp"

    /** Decrease media playback speed. (VK_PLAY_SPEED_DOWN) */
    final val PlaySpeedDown = "PlaySpeedDown"

    /** Reset playback to normal speed. (VK_PLAY_SPEED_RESET) */
    final val PlaySpeedReset = "PlaySpeedReset"

    /** Increase media playback speed. (VK_PLAY_SPEED_UP) */
    final val PlaySpeedUp = "PlaySpeedUp"

    /** Toggle random media or content shuffle mode. (VK_RANDOM_TOGGLE) */
    final val RandomToggle = "RandomToggle"

    /** Not a physical key, but this key code is sent when the remote control battery is low. (VK_RC_LOW_BATTERY) */
    final val RcLowBattery = "RcLowBattery"

    /** Toggle or cycle between media recording speeds. (VK_RECORD_SPEED_NEXT) */
    final val RecordSpeedNext = "RecordSpeedNext"

    /** Toggle RF (radio frequency) input bypass mode (pass RF input directly to the RF output). (VK_RF_BYPASS) */
    final val RfBypass = "RfBypass"

    /** Toggle scan channels mode. (VK_SCAN_CHANNELS_TOGGLE) */
    final val ScanChannelsToggle = "ScanChannelsToggle"

    /** Advance display screen mode to next available mode. (VK_SCREEN_MODE_NEXT) */
    final val ScreenModeNext = "ScreenModeNext"

    /** Toggle display of device settings screen. (VK_SETTINGS) */
    final val Settings = "Settings"

    /** Toggle split screen mode. (VK_SPLIT_SCREEN_TOGGLE) */
    final val SplitScreenToggle = "SplitScreenToggle"

    /** Toggle display of subtitles, if available. (VK_SUBTITLE) */
    final val Subtitle = "Subtitle"

    /** Toggle display of teletext, if available (VK_TELETEXT). */
    final val Teletext = "Teletext"

    /** Advance video mode to next available mode.(VK_VIDEO_MODE_NEXT) */
    final val VideoModeNext = "VideoModeNext"

    /** Cause device to identify itself in some manner, e.g., audibly or visibly. (VK_WINK) */
    final val Wink = "Wink"

    /** Toggle between full-screen and scaled content, or alter magnification level. (VK_ZOOM) */
    final val ZoomToggle = "ZoomToggle"
  }
}
