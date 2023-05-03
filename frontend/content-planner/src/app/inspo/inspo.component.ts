import { Component } from '@angular/core';

@Component({
  selector: 'app-inspo',
  templateUrl: './inspo.component.html',
  styleUrls: ['./inspo.component.scss']
})
export class InspoComponent {
  hooks = [
    {
      phrase: '"Why isn\'t anyone talking about X..."',
    },
    {
      phrase: '"Controversial opinion but..."',
    },
    {
      phrase: '"The biggest mistake you\'re making in ___"',
    },
    {
      phrase: '"Stop doing X (then show them what to do instead)"',
    },
    {
      phrase: '"Pro [niche] tip:"',
    },
    {
      phrase: '"This video is for X"',
    },
    {
      phrase: '"If you\'re anything like me ..."',
    },
    {
      phrase: '"The biggest secret other ___\'s aren\'t telling you"',
    },
    {
      phrase: '"Top 5 reasons you\'re not ___"',
    },
    {
      phrase: '"You NEED to hear this ..."',
    },
    {
      phrase: '"You may be doing X, but here\'s what worked better for me..."',
    },
    {
      phrase: '"I messed up... (share a valuable/ inspirational story that will help someone else)"',
    },
    {
      phrase: '"Here\'s the hard truth they are not telling you "',
    },
    {
      phrase: '"My top 3 tools for X"',
    },
    {
      phrase: '"The #1 mistake you\'re making in X"',
    },
    {
      phrase: '"BREAKING NEWS"',
    },
    {
      phrase: '"The real reason why you\'re not ___"',
    },
    {
      phrase: '"I\'d ask you to trust me, but decide for yourelf"',
    },
    {
      phrase: '"How would you feel if you had X"',
    },
    {
      phrase: '"What it really cost me to do X"',
    }
  ];

  keywords = [
    {
      category: 'Exclusivity',
      word: 'Secret',
    },
    {
      category: 'Exclusivity',
      word: 'Premium',
    },
    {
      category: 'Exclusivity',
      word: 'Earlybird',
    },
    {
      category: 'Exclusivity',
      word: 'Competitive',
    },
    {
      category: 'Exclusivity',
      word: 'Selective',
    },
    {
      category: 'Call to Action',
      word: 'Discover',
    },
    {
      category: 'Call to Action',
      word: 'Introducing',
    },
    {
      category: 'Call to Action',
      word: 'Accelerate',
    },
    {
      category: 'Call to Action',
      word: 'Extraordinary',
    },
    {
      category: 'Call to Action',
      word: 'Grow',
    },
    {
      category: 'Call to Action',
      word: 'Discover',
    },
    {
      category: 'Low Risk',
      word: 'Trusted',
    },
    {
      category: 'Low Risk',
      word: 'Signature',
    },
    {
      category: 'Low Risk',
      word: 'Investment',
    },
    {
      category: 'Low Risk',
      word: 'Cancel',
    },
    {
      category: 'Low Risk',
      word: 'Tested',
    },
    {
      category: 'Urgency',
      word: 'Immediately',
    },
    {
      category: 'Urgency',
      word: 'Only Available',
    },
    {
      category: 'Urgency',
      word: 'Today',
    },
    {
      category: 'Urgency',
      word: 'Hurry',
    },
    {
      category: 'Urgency',
      word: 'Turbo',
    },
    {
      category: 'Thank You',
      word: '"Okay, we are blushing."',
    },
    {
      category: 'Thank You',
      word: '"I\'m gonna call this a *win*."',
    },
    {
      category: 'Thank You',
      word: '"Right back atcha"',
    },
    {
      category: 'Thank You',
      word: '"I love everything about this comment."',
    },
    {
      category: 'Thank You',
      word: '"Thanks got the validation!"',
    },
    {
      category: 'Thank You',
      word: '"Well, that made me smile!"',
    },
    {
      category: 'Thank You',
      word: '"We appreciate you!"',
    },
    {
      category: 'Thank You',
      word: '"I\'ve officially peaked. Now I can nap."',
    },
    {
      category: 'Thank You',
      word: "Yay! So glad it was helpful!",
    },
    {
      category: 'You\'re welcome!',
      word: "Just what we like to hear!",
    },
    {
      category: 'You\'re welcome!',
      word: "More than happy to help!",
    },
    {
      category: 'You\'re welcome!',
      word: '"Woohoo! That was the goal!"',
    },
    {
      category: 'You\'re welcome!',
      word: '"Are you kidding? You\'re so welcome!"',
    },
    {
      category: 'You\'re welcome!',
      word: '"This kind of feedback makes our day!"',
    },
    {
      category: 'You\'re welcome!',
      word: '"You know we gotchu."',
    },
    {
      category: 'You\'re welcome!',
      word: '"Can\t wait to see how it works for you in practice!"',
    },
    {
      category: '"You\'re the best!"',
      word: '"Just what we like to hear!"',
    }

  ]

  story_ideas = [
    {
      description: 'Your daily schedule',
    },
    {
      description: 'Client tesitmonial',
    },
    {
      description: '1 thing you are working on today',
    },
    {
      description: 'Sticker asking followers how the\'re feeling',
    },
    {
      description: 'Something that made you laugh today',
    },
    {
      description: 'A quote that inspires you',
    },
    {
      description: 'Quiz sticker asking what your clients want to see more of from you',
    },
    {
      description: 'Reel from another creator that inspires you',
    },
    {
      description: 'A niche tip',
    },
    {
      description: 'A funny meme about your niche',
    },
    {
      description: 'Show your current view',
    },
    {
      description: 'How your morning went',
    },
    {
      description: 'How you acheived a goal',
    },
    {
      description: 'Answer a question from DM or comments',
    },
    {
      description: 'Your plan for the end of year',
    },
    {
      description: 'How your product helps people',
    },
    {
      description: 'Something you struggle with',
    },
    {
      description: 'Your opinoin on a topic in your niche',
    },
    {
      description: 'Gif of how you feel today',
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
