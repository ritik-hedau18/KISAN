/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        dark: {
          900: '#022c22', // Forest/emerald theme for AgriTech
          800: '#064e3b',
          700: '#0f766e',
          600: '#115e59'
        },
        kisan: {
          green: '#10B981',
          gold: '#F59E0B',
          earth: '#78350F',
          light: '#D1FAE5'
        }
      }
    },
  },
  plugins: [],
}

// minor tweak: update verification rules and configs
