package com.example.dailyzen.data.model

import androidx.compose.ui.graphics.Color
import com.example.dailyzen.ui.theme.*

data class journal(val date:Int, val day:String, val month:String, val dark:Color, val medium: Color, val Light:Color, val id:Int, val content:String, val title:String)

val JournalList = listOf(
    journal(
        date = 28,
        day = "Tuesday",
        month = "October",
        dark = DeepGreen,
        medium = MediumGreen,
        Light = LightGreen,
        id = 1,
        title = "Finding Focus",
        content = "Today was one of those slow-burn mornings where the world felt slightly out of sync, like a movie running one frame behind the audio. I woke up with a heavy head, scrolled too long, then hated myself for it. Eventually, I dragged myself to the gym and it fixed everything. There’s something hypnotic about repetition — lift, breathe, rest, repeat. My thoughts slowed down and clarity started to return. I realized most of my stress doesn’t come from doing too much, but from not deciding what’s important. Later, I worked on my app and hit a small breakthrough in UI design. Nothing revolutionary, but enough to make me smile. I’m learning that progress feels less like fireworks and more like a quiet nod to yourself — the kind that says, ‘You didn’t give up today.’"
    ),
    journal(
        date = 27,
        day = "Monday",
        month = "October",
        dark = DeepBlue,
        medium = MediumBlue,
        Light = LightBlue,
        id = 2,
        title = "A Small Win",
        content = "I spent most of today fighting distractions. Every time I sat to code, my brain started craving novelty — messages, YouTube, even cleaning my desk looked exciting. Eventually, I locked my phone in the drawer, turned on Lo-fi beats, and finished that stubborn function I’d been stuck on. When it finally worked, I laughed out loud — not because it was impressive, but because it reminded me how rare it feels to be fully *in it*. After lunch, I went for a short walk and noticed how good the evening light looked on the walls. There’s something about golden hour that softens even bad moods. I’m still far from where I want to be, but today felt like a small, honest win. Maybe that’s all discipline is — small wins stacked patiently, day after day."
    ),
    journal(
        date = 26,
        day = "Sunday",
        month = "October",
        dark = DeepAmber,
        medium = MediumAmber,
        Light = LightAmber,
        id = 3,
        title = "Learning to Slow Down",
        content = "I think I’ve been confusing speed with progress. I’ve been moving fast lately — switching tasks, refreshing notifications, trying to learn everything at once — and it’s making me tired, not better. Today, I forced myself to do one thing at a time. I read an article about design philosophy, and for once, I didn’t skim. I took notes, connected ideas, and it felt like my brain exhaled. Later, I cooked dinner slowly, without rushing to get back to my laptop. It reminded me that focus isn’t just a productivity trick, it’s a form of peace. You can’t build anything meaningful in chaos. Maybe tomorrow I’ll still get distracted, but tonight, I feel quieter — like I’m finally syncing back with myself."
    ),
    journal(
        date = 25,
        day = "Saturday",
        month = "October",
        dark = DeepViolet,
        medium = MediumViolet,
        Light = LightViolet,
        id = 4,
        title = "Reset Sunday",
        content = "I woke up late today, and for once, didn’t guilt myself about it. The sunlight was spilling through the curtains, and it felt like the world wasn’t in a hurry to move. I cleaned my room, changed the bedsheet, and brewed a strong cup of coffee. That small sense of order made my mind feel lighter. Later, I spent a few hours reviewing code I’d written earlier this week, and wow, past-me was definitely sleep-deprived when he named those variables. I fixed a few things, then took a walk in the evening. The wind smelled like dust and rain — that pre-monsoon mix that always makes me nostalgic for no reason. It reminded me that rest isn’t wasted time; it’s repair time. The world keeps spinning, but it doesn’t ask you to sprint every day."
    ),
    journal(
        date = 24,
        day = "Friday",
        month = "October",
        dark = DeepCoral,
        medium = MediumCoral,
        Light = LightCoral,
        id = 5,
        title = "The Loop of Motivation",
        content = "Motivation really is a joke some days. You wait for it like a guest who never shows up. This morning, I sat in front of my laptop for an hour, staring at the screen like it owed me inspiration. Nothing came. Eventually, I started anyway — slow, mechanical typing. Five minutes in, I felt a rhythm. Twenty minutes in, I was immersed. That’s when I realized motivation isn’t something you start with, it’s something that shows up *after* you start. It’s like a lazy friend who only helps once you’re already carrying the boxes. In the evening, I journaled a bit and realized how often I underestimate the power of small starts. Most progress begins quietly, with the simplest action: doing the next right thing, even when you don’t feel like it."
    ),
    journal(
        date = 23,
        day = "Thursday",
        month = "October",
        dark = DeepCyan,
        medium = MediumCyan,
        Light = LightCyan,
        id = 6,
        title = "Conversations with Silence",
        content = "There’s a kind of silence that doesn’t feel empty. I found it tonight while sitting on the balcony with no music, no phone, nothing but the hum of traffic far away. It felt uncomfortable at first, like I’d forgotten how to be alone without stimulation. But slowly, it turned peaceful. I started noticing things — the pattern of light on the wall, the sound of someone closing a gate, the faint smell of food from a neighbor’s kitchen. It made me realize how much I drown my senses just to avoid stillness. I think silence is a mirror, and most of us are afraid of what it shows. But once you sit through the noise inside your head, it becomes gentler. I ended the night feeling lighter, without doing anything special. Just listening, finally."
    ),
    journal(
        date = 22,
        day = "Wednesday",
        month = "October",
        dark = DeepSlate,
        medium = MediumSlate,
        Light = LightSlate,
        id = 7,
        title = "Code and Chaos",
        content = "Today was a classic developer day — bugs, caffeine, and questioning my life choices. My layout broke for no reason, my IDE froze, and my patience went on vacation. After nearly an hour of glaring at the screen, I took a breath, refactored calmly, and things started making sense. It’s weird how chaos clears when you stop fighting it. In between all that frustration, I remembered why I started coding in the first place — that mix of logic and creativity that feels like art when it works. It’s not glamorous, but it’s real. I ended up fixing the issue, learning something new, and realizing that frustration is just the toll you pay for growth. Maybe tomorrow’s code will break again, but so what? I’ll still show up. That’s the whole deal."
    ),
    journal(
        date = 21,
        day = "Tuesday",
        month = "October",
        dark = DeepAmber,
        medium = MediumAmber,
        Light = LightAmber,
        id = 8,
        title = "The Weight of Quiet Days",
        content = "Nothing remarkable happened today, and maybe that’s the point. I studied a bit, cleaned, scrolled too much, then stared at the ceiling longer than I’d like to admit. There’s this strange guilt that comes with uneventful days — like you should’ve been building an empire instead of existing. But when I think about it, quiet days are where the mind catches up. They’re the pause between the big moments. I did manage to sketch something random tonight, and that simple act reminded me I’m more than my to-do list. I keep expecting life to feel cinematic, but it’s mostly subtle scenes — small gestures, slow progress, and invisible healing. Maybe that’s what balance actually looks like."
    )
)